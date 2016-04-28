#!/bin/bash

while [ ! -e compiled.rb ] 
  do 
    sleep 10
  done

ruby compiled.rb -o 0.0.0.0
