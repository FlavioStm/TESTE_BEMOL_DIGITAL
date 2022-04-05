describe 'Cadastrando usuário' do
 
    it 'adicionando usuarios' do
        @new_user = {
            nome: "validandsdo user teste", 
            email: "11z1jaaa1@qa.com.br", 
            password: "teste",
            administrador: "true"
        }
        @request = ServerRest.post('/usuarios', :body => @new_user) #cadastrando usuário
        expect(@request.code).to eq(201) #validando status code
        expect(@request.message).to eq("Created") #validando se a mensagem foi exibida com exito
        expect(@request["name"]).to eq(@new_user[:name]) #validando se usuário foi cadastrado
    end


 end