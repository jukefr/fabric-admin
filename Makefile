runServer: buildServerImage runPackager
	docker run -it --mount src=$(CURDIR)/build/libs,target=/app/mods,type=bind fabric-admin-test-server

buildServerImage:
	docker build -t fabric-admin-test-server -f docker/server.Dockerfile .

runPackager: buildPackagerImage buildModJar
	docker run --mount src=$(CURDIR)/build/libs,target=/app/build,type=bind fabric-admin-packager

buildPackagerImage:
	docker build -t fabric-admin-packager -f docker/packager.Dockerfile .

buildModJar: createBuildFolder buildModImage
	docker run --mount src=$(CURDIR)/build,target=/home/gradle/src/build/,type=bind --mount src=$(CURDIR)/build/.gradle,target=/home/gradle/.gradle/,type=bind fabric-admin

buildModImage:
	docker build -t fabric-admin -f docker/mod.Dockerfile .

createBuildFolder:
	mkdir -p build
	mkdir -p build/.gradle

cleanBuild:
	rm -rf build
