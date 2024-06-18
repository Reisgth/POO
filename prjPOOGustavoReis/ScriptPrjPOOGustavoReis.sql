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
    numero VARCHAR2(50) PRIMARY KEY,
    dataEmissao VARCHAR2(15) NOT NULL,
    valor DECIMAL(10, 2) NOT NULL,
    cliente VARCHAR2(15) NOT NULL,
    vendedor VARCHAR2(15) NOT NULL,
    FOREIGN KEY (cliente) REFERENCES tb_cliente(cpf),
    FOREIGN KEY (vendedor) REFERENCES tb_vendedor(cpf)
);

SELECT * FROM TB_CLIENTE;
SELECT * FROM TB_VENDEDOR;
SELECT * FROM TB_PEDIDO;