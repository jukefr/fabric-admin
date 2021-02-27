runServer: buildServerImage runPackager
	docker run --mount src=$(CURDIR)/build,target=/app/mods,type=bind fabric-admin-test-server

buildServerImage:
	docker build -t fabric-admin-test-server -f docker/server.Dockerfile .

runPackager: buildPackagerImage buildModJar
	docker run --mount src=$(CURDIR)/build,target=/app/build,type=bind fabric-admin-packager

buildPackagerImage:
	docker build -t fabric-admin-packager -f docker/packager.Dockerfile .

buildModJar: createBuildFolder buildModImage
	docker run --mount src=$(CURDIR)/build,target=/home/gradle/src/build/libs/,type=bind fabric-admin

buildModImage:
	docker build -t fabric-admin -f docker/mod.Dockerfile .

createBuildFolder: cleanBuild
	mkdir -p build

cleanBuild:
	rm -rf build
