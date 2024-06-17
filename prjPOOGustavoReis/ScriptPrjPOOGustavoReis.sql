CREATE TABLE tb_cliente (
    cpf VARCHAR2(15) PRIMARY KEY,
    nome VARCHAR2(100) NOT NULL,
    endereco VARCHAR2(150),
    cidade VARCHAR2(50),
    uf VARCHAR2(2),
    cep VARCHAR2(10),
    ddd VARCHAR2(5),
    telefone VARCHAR2(15),
    limiteCredito DECIMAL(10, 2),
    limiteDisponivel DECIMAL(10, 2)
); 

CREATE TABLE tb_vendedor (
    cpf VARCHAR2(15) PRIMARY KEY,
    nome VARCHAR2(100) NOT NULL,
    endereco VARCHAR2(150),
    cidade VARCHAR2(50),
    uf VARCHAR2(2),
    cep VARCHAR2(10),
    ddd VARCHAR2(5),
    telefone VARCHAR2(15),
    salarioBase DECIMAL(10, 2),
    taxaComissao DECIMAL(5, 2)
);

CREATE TABLE tb_pedido (
    numero INT PRIMARY KEY,
    dataEmissao DATE NOT NULL,
    valor DECIMAL(10, 2) NOT NULL,
    cliente VARCHAR2(15) NOT NULL,
    vendedor VARCHAR2(15) NOT NULL,
    FOREIGN KEY (cliente) REFERENCES tb_cliente(cpf),
    FOREIGN KEY (vendedor) REFERENCES tb_vendedor(cpf)
);

DROP TABLE TB_CLIENTE;
DROP TABLE TB_VENDEDOR;
DROP TABLE TB_PEDIDO;

INSERT INTO TB_CLIENTE VALUES ('43965502867', 'GUSTAVO REIS', 'RUA A', 'SOROCABA', 
                                'SP', '18090000', '15', '981649596', '10000', '10000');
                                
INSERT INTO TB_CLIENTE VALUES ('12345678900', 'JOSE DA SILVA', 'RUA X', 'SALTO DE PIRAPORA', 
                                'SP', '12345000', '15', '910101010', '12345', '12345');
                                
UPDATE TB_CLIENTE SET nome = 'JOSE DA SILVA', endereco = 'RUA X', cidade = 'SALTINHO', uf = 'SP', cep = '12345000', ddd = '15',
                      telefone = '910101010', limiteCredito = '12345', limiteDisponivel = '12345'
                      WHERE CPF = '12345678900';
            
DELETE TB_CLIENTE;
                      
SELECT * from tb_cliente

SELECT * from tb_cliente where cpf = '43965502867'