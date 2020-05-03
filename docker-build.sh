#!/bin/sh

docker build . -t small-frozen-ostrich-app

echo
echo "To run the docker container execute:"
echo "    $ docker run -p 8080:8080 small-frozen-ostrich-app"