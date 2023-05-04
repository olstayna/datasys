-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 04-Maio-2023 às 18:35
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `datasys`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `login`
--

CREATE TABLE `login` (
  `ID` int(11) NOT NULL,
  `NOME` varchar(100) DEFAULT NULL,
  `SOBRENOME` varchar(100) DEFAULT NULL,
  `SENHA` varchar(25) DEFAULT NULL,
  `RA` int(11) DEFAULT NULL,
  `CURSO` varchar(10) NOT NULL,
  `CARGO` varchar(10) NOT NULL,
  `GENERO` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `login`
--

INSERT INTO `login` (`ID`, `NOME`, `SOBRENOME`, `SENHA`, `RA`, `CURSO`, `CARGO`, `GENERO`) VALUES
(1, 'Teste', 'MySQL', '12345678', 176961653, '', '', ''),
(2, 'Teste', 'Inserindo', '12345678', 287528812, 'ADS', 'Professor', ''),
(3, 'Teste', 'Teste', '12345678', 792679399, 'ADS', 'Professor', ''),
(4, 'Teste', 'Combo', '12345678', 794591509, 'ADS', 'Professor', ''),
(5, 'Testando', 'Genero', '12345678', 991922941, 'CC', 'Professor', 'Feminino');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
