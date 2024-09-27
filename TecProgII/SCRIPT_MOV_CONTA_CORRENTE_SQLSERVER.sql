CREATE DATABASE MOV_CONTA_CORRENTE
GO

USE MOV_CONTA_CORRENTE
GO

CREATE TABLE AGENCIAS(
	NUM_AGE	NUMERIC(5,0) PRIMARY KEY NOT NULL,
	NOME_AGE VARCHAR(30) NOT NULL,
	ENDE_AGE VARCHAR(50) NOT NULL,
	NUME_AGE VARCHAR(8),
	COMPL_AGE VARCHAR(20),
	BAIR_AGE VARCHAR(20),
	CIDA_AGE VARCHAR(30) NOT NULL,
	UF_AGE CHAR(2) NOT NULL,
	CEP_AGE CHAR(8) NOT NULL,
	FONE_AGE VARCHAR(13)
	)

CREATE TABLE CLIENTES(
	ID_CLI NUMERIC(9,0) PRIMARY KEY NOT NULL,
	NOME_CLI VARCHAR(50) NOT NULL,
	ENDE_CLI VARCHAR(50) NOT NULL,
	NUME_CLI VARCHAR(8),
	COMPL_CLI VARCHAR(20),
	BAIR_CLI VARCHAR(20),
	CIDA_CLI VARCHAR(30) NOT NULL,
	UF_CLI CHAR(2) NOT NULL,
	CEP_CLI CHAR(8) NOT NULL,
	FONE_CLI VARCHAR(13),
	CPF_CLI CHAR(11),
	DATA_NASC DATETIME,
	CNPJ_CLI CHAR(14)
)

CREATE TABLE HISTORICOS(
	ID_HIS NUMERIC(4,0) PRIMARY KEY NOT NULL,
	DES_HIS VARCHAR(30) NOT NULL
)

CREATE TABLE CONTACORRENTE(
	NUM_AGE NUMERIC(5,0) NOT NULL,
	NUM_CC NUMERIC(10,0) NOT NULL,
	ID_CLI NUMERIC(9,0) NOT NULL,
	SALDO NUMERIC(15,2),
	PRIMARY KEY (NUM_AGE,NUM_CC),
	CONSTRAINT FK_CONTACORRENTE_AGE FOREIGN KEY (NUM_AGE) REFERENCES AGENCIAS(NUM_AGE),
	CONSTRAINT FK_CONTACORRENTE_CLI FOREIGN KEY (ID_CLI) REFERENCES CLIENTES(ID_CLI)
)

CREATE TABLE USUARIOS(
	ID VARCHAR(20) PRIMARY KEY NOT NULL,
	SENHA VARCHAR(20) NOT NULL,
	NUM_AGE NUMERIC(5,0) NOT NULL,
	NUM_CC NUMERIC(10,0) NOT NULL,
	CONSTRAINT FK_USUARIOS_CC FOREIGN KEY (NUM_AGE,NUM_CC) REFERENCES CONTACORRENTE(NUM_AGE,NUM_CC)
)

CREATE TABLE MOVIMENTACAO(
	NUM_AGE NUMERIC(5,0) NOT NULL,
	NUM_CC NUMERIC(10,0) NOT NULL,
	DATA_MOV DATETIME NOT NULL,
	NUM_DOCTO VARCHAR(6) NOT NULL,
	DEBITO_CREDITO CHAR(1) NOT NULL,
	ID_HIS NUMERIC(4,0) NOT NULL,
	COMPL_HIS VARCHAR(30),
	VALOR NUMERIC(9,2) NOT NULL,
	SALDO NUMERIC(15,2),
	PRIMARY KEY (NUM_AGE,NUM_CC,DATA_MOV,NUM_DOCTO),
	CONSTRAINT FK_MOVIMENTACAO_AGE FOREIGN KEY (NUM_AGE) REFERENCES AGENCIAS(NUM_AGE),
	CONSTRAINT FK_MOVIMENTACAO_CC FOREIGN KEY (NUM_AGE,NUM_CC) REFERENCES CONTACORRENTE(NUM_AGE,NUM_CC),
	CONSTRAINT FK_MOVIMENTACAO_HIS FOREIGN KEY (ID_HIS) REFERENCES HISTORICOS(ID_HIS)
)

USE MOV_CONTA_CORRENTE;

INSERT INTO AGENCIAS (NUM_AGE, NOME_AGE, ENDE_AGE, NUME_AGE, COMPL_AGE, BAIR_AGE, CIDA_AGE, UF_AGE, CEP_AGE, FONE_AGE) VALUES
(02001, 'Ag�ncia Banco do Brasil', 'Av. Rio Branco', '181', '', 'Centro', 'Rio de Janeiro', 'RJ', '20040007', '(21)3808-3000'),
(02002, 'Ag�ncia Caixa', 'Av. Sete de Setembro', '1635', 'Ed. Oceania', 'Vit�ria', 'Salvador', 'BA', '40080002', '(71)3319-5000'),
(02003, 'Ag�ncia Ita�', 'Av. Paulista', '1230', '5� andar', 'Bela Vista', 'S�o Paulo', 'SP', '01310200', '(11)4004-4828'),
(02004, 'Ag�ncia Bradesco', 'Rua dos Tupis', '337', '', 'Centro', 'Belo Horizonte', 'MG', '30190060', '(31)3279-0800'),
(02005, 'Ag�ncia Santander', 'Av. Farrapos', '385', '', 'Floresta', 'Porto Alegre', 'RS', '90220002', '(51)3378-8300');

INSERT INTO CLIENTES (ID_CLI, NOME_CLI, ENDE_CLI, NUME_CLI, COMPL_CLI, BAIR_CLI, CIDA_CLI, UF_CLI, CEP_CLI, FONE_CLI, CPF_CLI, DATA_NASC, CNPJ_CLI) VALUES
(020000001, 'Bentinho Santiago', 'Rua Capitu', '12', 'Casa 2', 'Gl�ria', 'Rio de Janeiro', 'RJ', '20251001', '(21)1234-5678', '12345678901', '10-10-1984', NULL),
(020000002, 'Capitu Santiago', 'Rua Capitu', '12', 'Casa 2', 'Gl�ria', 'Rio de Janeiro', 'RJ', '20251001', '(21)9876-5432', '10987654321', '15-10-1998', NULL),
(020000003, 'Rita Baiana', 'Rua da Quitanda', '34', NULL, 'Centro', 'Salvador', 'BA', '40000000', '(71)2345-6789', '23456789012', '22-03-1855', NULL),
(020000004, 'Macuna�ma', 'Rua do Mito', '55', 'Ap 7', 'Centro', 'S�o Paulo', 'SP', '01000001', '(11)3456-7890', '34567890123', '20-04-1902', NULL),
(020000005, 'Iracema', 'Rua Lenda', '99', '26', 'Centro', 'Fortaleza', 'CE', '60000000', '(85)4567-8901', '45678901234', '17-08-1967', NULL);


INSERT INTO HISTORICOS (ID_HIS, DES_HIS) VALUES
(1, 'Dep�sito em conta'),
(2, 'Transfer�ncia entre contas'),
(3, 'Saque'),
(4, 'Pagamento de boleto'),
(5, 'Compra com cart�o de d�bito');

INSERT INTO CONTACORRENTE (NUM_AGE, NUM_CC, ID_CLI, SALDO) VALUES
(0201, 1234567890, 020000001, 5000.00),
(0202, 2345678901, 020000002, 3000.00),
(0203, 3456789012, 020000003, 4000.00),
(0204, 4567890123, 020000004, 2000.00),
(0205, 5678901234, 020000005, 7000.00);

INSERT INTO USUARIOS (ID, SENHA, NUM_AGE, NUM_CC) VALUES
('bentinho', 'senha123', 02001, 1234567890),
('capitu', 'segredo987', 02002, 2345678901),
('rita', 'amor456', 02003, 3456789012),
('macunaima', 'indio123', 02004, 4567890123),
('iracema', 'guerreira789', 02005, 5678901234);

INSERT INTO MOVIMENTACAO (NUM_AGE, NUM_CC, DATA_MOV, NUM_DOCTO, DEBITO_CREDITO, ID_HIS, COMPL_HIS, VALOR, SALDO) VALUES
(02001, 1234567890, '19-09-2024', '000001', 'C', 1, 'Dep�sito inicial', 5000.00, 5000.00),
(02002, 2345678901, '19-09-2024', '000002', 'D', 1, 'Dep�sito inicial', 3000.00, 3000.00),
(02003, 3456789012, '19-09-2024', '000003', 'C', 1, 'Dep�sito inicial', 4000.00, 4000.00),
(02004, 4567890123, '19-09-2024', '000004', 'C', 1, 'Dep�sito inicial', 2000.00, 2000.00),
(02005, 5678901234, '19-09-2024', '000005', 'C', 1, 'Dep�sito inicial', 7000.00, 7000.00);
