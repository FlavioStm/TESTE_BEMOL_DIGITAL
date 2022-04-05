describe 'agrupando os metodos de verbo GET' do
 
    it 'meu primeiro teste - listando users' do
        @users = ServerRest.get('/usuarios')
        puts @users
    end

 end