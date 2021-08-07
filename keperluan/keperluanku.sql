-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 07 Agu 2021 pada 16.13
-- Versi server: 10.1.38-MariaDB
-- Versi PHP: 5.6.40

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `keperluanku`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `minggu1`
--

CREATE TABLE `minggu1` (
  `idm1` int(3) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `merk` varchar(30) NOT NULL,
  `harga` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `minggu1`
--

INSERT INTO `minggu1` (`idm1`, `nama_barang`, `merk`, `harga`) VALUES
(1, 'mentega', 'blueband', 10000),
(2, 'biskuit gandum', 'roma', 7000),
(3, 'sambal cabai', 'belibis', 13000),
(4, 'kecap asin', 'bangau', 8500);

-- --------------------------------------------------------

--
-- Struktur dari tabel `minggu2`
--

CREATE TABLE `minggu2` (
  `idm2` int(3) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `merk` varchar(30) NOT NULL,
  `harga` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `minggu2`
--

INSERT INTO `minggu2` (`idm2`, `nama_barang`, `merk`, `harga`) VALUES
(1, 'sabun', 'dettol', 5000),
(2, 'shampo', 'pantene', 7500);

-- --------------------------------------------------------

--
-- Struktur dari tabel `minggu3`
--

CREATE TABLE `minggu3` (
  `idm3` int(3) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `merk` varchar(30) NOT NULL,
  `harga` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `minggu3`
--

INSERT INTO `minggu3` (`idm3`, `nama_barang`, `merk`, `harga`) VALUES
(1, 'sabun piring', 'mama lemon', 13500),
(2, 'tisu', 'paseo', 5000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `minggu4`
--

CREATE TABLE `minggu4` (
  `idm4` int(3) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `merk` varchar(30) NOT NULL,
  `harga` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `minggu4`
--

INSERT INTO `minggu4` (`idm4`, `nama_barang`, `merk`, `harga`) VALUES
(1, 'minuman dehidrasi', 'pocari sweat', 8000),
(2, 'biskuit kaleng', 'khong guan', 15500);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `minggu1`
--
ALTER TABLE `minggu1`
  ADD PRIMARY KEY (`idm1`);

--
-- Indeks untuk tabel `minggu2`
--
ALTER TABLE `minggu2`
  ADD PRIMARY KEY (`idm2`);

--
-- Indeks untuk tabel `minggu3`
--
ALTER TABLE `minggu3`
  ADD PRIMARY KEY (`idm3`);

--
-- Indeks untuk tabel `minggu4`
--
ALTER TABLE `minggu4`
  ADD PRIMARY KEY (`idm4`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
