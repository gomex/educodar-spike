require 'sinatra'

get '/' do
	return 'Eba! o/ Esta tudo funcionando!';
end

get '/teste/1' do
	return 'Oi, Teste 1';
end

get '/teste/2' do
	return 'Oi, Teste 2';
end
