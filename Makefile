
runServer: buildMod
	docker run

buildMod:
	docker build

clean:
	rm -rf build