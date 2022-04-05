module.exports = server => {

    const connection = require('../database/connection');
    
    server.get('/', (require, response) => {
        response.json({message: 'Bem vindo ao catálogo dos seus Documentários'})
    })

    server.get('/documentaries', (require, response) => {
        const sql = '';
        connection.query(sql, (error, res) => {
            if (error){
                return error;
            } console.log("documentaries: ", res);
            response.json(res)
        })
    })
};
