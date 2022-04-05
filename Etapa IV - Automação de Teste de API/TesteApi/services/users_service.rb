module ServerRest
    include HTTParty
    base_uri 'http://localhost:3000'
    format :json
 end