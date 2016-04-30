#!/bin/bash

docker_compose=docker-compose.yml
proxy=dominios.conf
qtd=0

cat $docker_compose | grep aluno1 > /dev/null

if [ $? == 0 ] ; then
  echo "Você já configurou seu ambiente"

else

  while [ $qtd -le 0 ]
  do
    read -p "Quantas pessoas na turma?" qtd
  done

  for (( i=1; i <= $qtd; i++ ))
  do

    echo "  aluno$i:" >> $docker_compose 
    echo "    build:" >> $docker_compose
    echo "      context: ." >> $docker_compose
    echo "      dockerfile: Dockerfile_ruby" >> $docker_compose
    echo "    volumes:" >> $docker_compose
    echo "      - /educodar" >> $docker_compose

    echo "  location /aluno$i {" >> $proxy
    echo "    proxy_pass  http://aluno$i:4567/;" >> $proxy 
    echo "  }" >> $proxy

  done 
echo "}" >> $proxy
fi
