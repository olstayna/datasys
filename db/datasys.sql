-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 30, 2023 at 08:32 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `datasys`
--

-- --------------------------------------------------------

--
-- Table structure for table `endereco`
--

CREATE TABLE `endereco` (
  `ID` int(11) NOT NULL,
  `RA` int(9) NOT NULL,
  `LOGRADOURO` varchar(30) NOT NULL,
  `CIDADE` varchar(30) NOT NULL,
  `NUMERO` varchar(5) NOT NULL,
  `ESTADO` varchar(2) NOT NULL,
  `BAIRRO` varchar(20) NOT NULL,
  `COMPLEMENTO` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `endereco`
--

INSERT INTO `endereco` (`ID`, `RA`, `LOGRADOURO`, `CIDADE`, `NUMERO`, `ESTADO`, `BAIRRO`, `COMPLEMENTO`) VALUES
(1, 77573487, 'abc', 'sbc', '421', 'SP', 'ass', ''),
(2, 572527674, 'abc', 'sbc', '214', 'SP', 'sad', ''),
(3, 151797601, 'abc', 'sbc', '421', 'SP', 'ass', ''),
(4, 810540035, 'rua pedro', 'cidade bial', '13', 'SC', 'bairro peal', 'faz o l');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `ID` int(11) NOT NULL,
  `RA` int(9) NOT NULL,
  `NOME` varchar(100) DEFAULT NULL,
  `SOBRENOME` varchar(100) DEFAULT NULL,
  `SENHA` varchar(25) DEFAULT NULL,
  `EMAIL` varchar(50) DEFAULT NULL,
  `TELEFONE` varchar(15) DEFAULT NULL,
  `CURSO` varchar(10) DEFAULT NULL,
  `CARGO` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`ID`, `RA`, `NOME`, `SOBRENOME`, `SENHA`, `EMAIL`, `TELEFONE`, `CURSO`, `CARGO`) VALUES
(1, 77573487, 'lorenzo', 'casa', 'asdasdasd', 'gostoso@gmail.com', '321321321', 'SI', 'Aluno'),
(2, 572527674, 'gustavo', 'barbero', 'asdasdasd', 'gostoso@gmail.com', '42141241', 'ADS', 'Aluno'),
(3, 151797601, ' carol', 'dal mas', 'asdasdasd', 'gostosa@gmail.com', '4124124', 'SI', 'Aluno'),
(4, 810540035, 'pedro', 'pintudo', 'asdasdasd', 'pedrinhomatador@gmail.com', '1231241421', 'GTI', 'Professor');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `endereco`
--
ALTER TABLE `endereco`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `RA` (`RA`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `RA` (`RA`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
