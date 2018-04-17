-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 11-Abr-2018 às 01:38
-- Versão do servidor: 5.7.17
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbempregados`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `assalariado`
--

CREATE TABLE `assalariado` (
  `IdSalario` int(11) NOT NULL,
  `SalarioEmp` decimal(8,2) NOT NULL,
  `IdEmp` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `comissionado`
--

CREATE TABLE `comissionado` (
  `IdComiss` int(11) NOT NULL,
  `TotalVenda` float NOT NULL,
  `TaxaComissao` float NOT NULL,
  `IdEmp` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `empregado`
--

CREATE TABLE `empregado` (
  `IdEmp` int(11) NOT NULL,
  `NomeEmp` varchar(15) NOT NULL,
  `SobNomeEmp` varchar(20) NOT NULL,
  `CPFEmp` varchar(15) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `horista`
--

CREATE TABLE `horista` (
  `IdHorista` int(11) NOT NULL,
  `PrecoHora` int(11) NOT NULL,
  `HorasTrabalhadas` int(11) NOT NULL,
  `IdEmp` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `assalariado`
--
ALTER TABLE `assalariado`
  ADD PRIMARY KEY (`IdSalario`);

--
-- Indexes for table `comissionado`
--
ALTER TABLE `comissionado`
  ADD PRIMARY KEY (`IdComiss`);

--
-- Indexes for table `empregado`
--
ALTER TABLE `empregado`
  ADD PRIMARY KEY (`IdEmp`);

--
-- Indexes for table `horista`
--
ALTER TABLE `horista`
  ADD PRIMARY KEY (`IdHorista`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `assalariado`
--
ALTER TABLE `assalariado`
  MODIFY `IdSalario` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `comissionado`
--
ALTER TABLE `comissionado`
  MODIFY `IdComiss` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `empregado`
--
ALTER TABLE `empregado`
  MODIFY `IdEmp` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `horista`
--
ALTER TABLE `horista`
  MODIFY `IdHorista` int(11) NOT NULL AUTO_INCREMENT;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
