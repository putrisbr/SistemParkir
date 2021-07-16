-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 09 Bulan Mei 2020 pada 23.00
-- Versi server: 10.1.39-MariaDB
-- Versi PHP: 7.3.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_sistemparkir`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `info_parkir`
--

CREATE TABLE `info_parkir` (
  `kode_parkir` int(15) NOT NULL,
  `tanggal_parkir` varchar(10) NOT NULL,
  `waktu_parkir` varchar(10) NOT NULL,
  `status` varchar(10) NOT NULL,
  `jam_keluar` varchar(10) NOT NULL,
  `tarif` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `info_parkir`
--

INSERT INTO `info_parkir` (`kode_parkir`, `tanggal_parkir`, `waktu_parkir`, `status`, `jam_keluar`, `tarif`) VALUES
(97337355, '2020/05/09', '22:09:17', 'belum', 'q', ''),
(409990341, '2020/05/09', '21:41:56', 'belum', '', ''),
(1475558585, '2020/05/10', '03:56:11', 'belum', '', ''),
(1771288115, '2020/05/09', '22:08:49', 'belum', '', '');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_admin`
--

CREATE TABLE `tb_admin` (
  `namaAdm` varchar(25) NOT NULL,
  `kodeAdm` char(5) NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL,
  `notelpAdm` varchar(12) NOT NULL,
  `alamatAdm` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_admin`
--

INSERT INTO `tb_admin` (`namaAdm`, `kodeAdm`, `username`, `password`, `notelpAdm`, `alamatAdm`) VALUES
('Kahfi', 'AD001', 'kahfikmr', 'kahfi123', '08127855746', 'Bandung');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_pegawai`
--

CREATE TABLE `tb_pegawai` (
  `namaPeg` varchar(25) NOT NULL,
  `kodePeg` char(5) NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL,
  `notelpPeg` varchar(12) NOT NULL,
  `alamatPeg` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_pegawai`
--

INSERT INTO `tb_pegawai` (`namaPeg`, `kodePeg`, `username`, `password`, `notelpPeg`, `alamatPeg`) VALUES
('Zaki', 'PG001', 'zaki', 'zaki99', '087888999000', 'Bandung'),
('Putri', 'PG002', 'putri', 'putri27', '088777999888', 'Bekasi'),
('Sendy', 'PG003', 'sendy', 'sendy123', '089777888999', 'Bandung'),
('Siti', 'PG004', 'siti', 'siti99', '000888999000', 'Jakarta');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `info_parkir`
--
ALTER TABLE `info_parkir`
  ADD PRIMARY KEY (`kode_parkir`);

--
-- Indeks untuk tabel `tb_admin`
--
ALTER TABLE `tb_admin`
  ADD PRIMARY KEY (`kodeAdm`);

--
-- Indeks untuk tabel `tb_pegawai`
--
ALTER TABLE `tb_pegawai`
  ADD PRIMARY KEY (`kodePeg`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
