const swaggerJsdoc = require('swagger-jsdoc');

const options = {
    definition: {
        openapi: '3.0.0',
        info: {
            title: 'Projeto de PI',
            version: '1.0.0',
            description: 'API para gerenciamento de cadastros.',
        },
    },
    apis: ['./routes/*.js'], // Caminho para as rotas que serão documentadas
};

const swaggerSpecs = swaggerJsdoc(options);
module.exports = swaggerSpecs;
