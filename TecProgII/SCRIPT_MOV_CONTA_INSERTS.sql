INSERT INTO AGENCIAS (NUM_AGE, NOME_AGE, ENDE_AGE, NUME_AGE, COMPL_AGE, BAIR_AGE, CIDA_AGE, UF_AGE, CEP_AGE, FONE_AGE) VALUES
(22001, 'Agência Conecta', 'Avenida 31 de Março', '245', '', 'Centro', 'Votorantim', 'SP', '18110005', '(15) 97218968'),
(22002, 'Agência Novo Horizonte', 'Rua Inês Correia de Araújo', '1517', 'Piso Superior', 'Jacarepaguá', 'Rio de Janeiro', 'RJ', '22743830', '(21) 89247347'),
(22003, 'Agência Futuro Seguro', 'Rua Neri de Barcelos', '764', 'Próximo ao parque', ' Cidade Tiradentes', 'São Paulo', 'SP', '03523020', '(11) 30835825'),
(22004, 'Agência Horizonte Financeiro', 'Avenida Perimetral Oeste', '1788', '', 'Setor Santos Dumont', 'Goiânia', 'GO', '74463840', '(62) 47083192'),
(22005, 'Agência Estrela do Amanhã', 'Rua Raimundo Marques', '621', '', 'Vila Emplavi', 'São Luís', 'MA', '65048540', '(98) 77642605');

INSERT INTO CLIENTES (ID_CLI, NOME_CLI, ENDE_CLI, NUME_CLI, COMPL_CLI, BAIR_CLI, CIDA_CLI, UF_CLI, CEP_CLI, FONE_CLI, CPF_CLI, DATA_NASC, CNPJ_CLI) VALUES
(22001, 'Murilo Rodrigues dos Santos', 'Avenida Tiradentes', 266, 'Apto 402', 'Vossoroca', 'Votorantim', 'SP', '18116180', '19968076911', '49105982863', '12-01-1997', NULL),
(22002, 'Bruna Santos Goncalves', 'Rua Santo Amaro', '253', '', 'Jardim das Flores', 'São Luís', 'MA', '65046580', '9880132279', '71852740108', '08-05-1989', NULL),
(22003, 'Pedro Ferreira Melo', 'Rua Quatorze', '51', '', 'Zona Sul', 'Atibaia', 'SP', '30330303', '1180677249', '52263013750', '12-10-1962', NULL),
(22004, 'Thiago Ribeiro Carvalho', 'Rua Coronel Virgílio Xavier de Barros', '1544', '', 'Zona Norte', 'Goiânia', 'GO', '74660100', '6294307602', '78303682105', '21-11-2004', NULL),
(22005, 'Ágatha Cavalcanti Dias', 'Avenida Dom João VI', '1658', '', 'Zona Leste', 'Volta Redonda', 'RJ', '27211105', '2437397041', '69543101400', '02-10-1997', NULL);
 
INSERT INTO HISTORICOS (ID_HIS, DES_HIS) VALUES
(1, 'Depósito'),
(2, 'Saque'),
(3, 'Transferência'),
(4, 'Pagamento'),
(5, 'Consulta de saldo');
 
INSERT INTO CONTACORRENTE (NUM_AGE, NUM_CC, ID_CLI, SALDO) VALUES
(22001, 2200000001, 22001, 3000.00),
(22002, 2200000002, 22002, 2500.13),
(22003, 2200000003, 22003, 1500.25),
(22004, 2200000004, 22004, 723.79),
(22005, 2200000005, 22005, 600.00);
 
INSERT INTO USUARIOS (ID, SENHA, NUM_AGE, NUM_CC) VALUES
('murilo_22', 'S3nh@M@rilo!', 22001, 2200000001),
('bruna_22', 'Brun@G0ncalves123', 22002, 2200000002),
('pedro_22', 'P3dr0@M3lo!', 22003, 2200000003),
('thiago_22', 'T!h@goC4rvalho', 22004, 2200000004),
('agatha_22', 'Ag@thaD!as2024', 22005, 2200000005);
 
INSERT INTO MOVIMENTACAO (NUM_AGE, NUM_CC, DATA_MOV, NUM_DOCTO, DEBITO_CREDITO, ID_HIS, COMPL_HIS, VALOR, SALDO) VALUES
(22001, 2200000001, '2024-01-01 10:00:00', '001', 'C', 1, 'Depósito', 500.00, 3500.00),
(22002, 2200000002, '2024-01-02 11:00:00', '002', 'D', 2, 'Saque Caixa', 250.00, 2250.13),
(22003, 2200000003, '2024-01-03 12:00:00', '003', 'C', 1, 'Depósito', 1500.00, 3000.25),
(22004, 2200000004, '2024-01-04 13:00:00', '004', 'D', 4, 'Pagamento no cartão', 50.00, 723.79),
(22005, 2200000005, '2024-01-05 14:00:00', '005', 'C', 1, 'Transferência', 450.00, 1050.00);