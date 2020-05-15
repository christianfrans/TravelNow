-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 11 Bulan Mei 2020 pada 07.04
-- Versi server: 10.4.11-MariaDB
-- Versi PHP: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `travelnow`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `airlines`
--

CREATE TABLE `airlines` (
  `id` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `description` varchar(230) DEFAULT NULL,
  `name` varchar(230) DEFAULT NULL,
  `deleted_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `airlines`
--

INSERT INTO `airlines` (`id`, `price`, `description`, `name`, `deleted_at`) VALUES
(1, 15000000, 'Japan, South Korea, China', 'Kingdom', NULL),
(2, 13000000, 'Hongkong, Turkey, Vietnam', 'Phylum', NULL),
(3, 10000000, 'Malaysia, Thailand, Singapore', 'Class', NULL);

-- --------------------------------------------------------

--
-- Struktur dari tabel `bookings`
--

CREATE TABLE `bookings` (
  `id` int(11) NOT NULL,
  `users_id` int(11) NOT NULL,
  `hotels_id` int(11) NOT NULL,
  `packets_id` int(11) NOT NULL,
  `airlines_id` int(11) NOT NULL,
  `estimation` int(11) NOT NULL,
  `passengers` int(11) NOT NULL,
  `price` bigint(20) NOT NULL,
  `departuredate` datetime NOT NULL,
  `deleted_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `bookings`
--

INSERT INTO `bookings` (`id`, `users_id`, `hotels_id`, `packets_id`, `airlines_id`, `estimation`, `passengers`, `price`, `departuredate`, `deleted_at`) VALUES
(61, 17, 3, 2, 3, 3, 2, 65700000, '2020-05-18 00:00:00', '2020-05-08 15:09:09'),
(62, 17, 3, 2, 2, 7, 3, 286950000, '2020-08-21 00:00:00', '2020-05-08 15:09:26'),
(63, 17, 2, 2, 1, 4, 2, 127400000, '2020-11-13 00:00:00', NULL),
(64, 18, 1, 2, 1, 4, 2, 129000000, '2021-03-18 00:00:00', NULL),
(65, 19, 3, 1, 2, 3, 4, 169400000, '2020-05-25 00:00:00', NULL),
(66, 19, 2, 3, 2, 3, 2, 83300000, '2020-07-22 00:00:00', '2020-05-08 18:38:17'),
(67, 19, 3, 2, 2, 2, 3, 85200000, '2021-03-22 00:00:00', '2020-05-08 18:45:33'),
(68, 19, 1, 2, 1, 2, 2, 66000000, '2020-11-25 00:00:00', NULL),
(69, 19, 3, 2, 3, 3, 2, 65700000, '2020-05-23 00:00:00', NULL),
(70, 19, 1, 3, 1, 3, 2, 96500000, '2020-05-28 00:00:00', NULL),
(71, 19, 1, 1, 1, 3, 2, 98500000, '2020-05-27 00:00:00', NULL),
(72, 19, 1, 3, 1, 2, 2, 65000000, '2020-05-26 00:00:00', NULL),
(73, 19, 1, 1, 1, 2, 3, 100500000, '2020-05-26 00:00:00', '2020-05-08 22:09:49'),
(74, 19, 3, 1, 1, 2, 2, 65800000, '2020-07-14 00:00:00', '2020-05-08 22:09:58'),
(75, 19, 1, 2, 3, 2, 2, 46000000, '2020-08-25 00:00:00', '2020-05-08 22:09:56'),
(76, 19, 2, 3, 1, 2, 2, 64200000, '2020-05-18 00:00:00', NULL),
(77, 17, 1, 1, 1, 2, 2, 67000000, '2020-05-25 00:00:00', NULL),
(78, 19, 7, 2, 2, 2, 2, 59000000, '2020-08-05 00:00:00', NULL),
(79, 20, 3, 3, 3, 2, 2, 43800000, '2020-05-25 00:00:00', NULL),
(80, 21, 3, 2, 1, 2, 2, 64800000, '2020-10-20 00:00:00', '2020-05-11 11:08:56');

-- --------------------------------------------------------

--
-- Struktur dari tabel `hotels`
--

CREATE TABLE `hotels` (
  `id` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `description` varchar(230) DEFAULT NULL,
  `name` varchar(230) DEFAULT NULL,
  `deleted_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `hotels`
--

INSERT INTO `hotels` (`id`, `price`, `description`, `name`, `deleted_at`) VALUES
(1, 750000, '5 Star Hotel', 'Intercontinental Hotel', NULL),
(2, 550000, '4 Star Hotel', 'Four Seasons Hotel', NULL),
(3, 450000, '3 Star Hotel', 'RedDoorz Hotel', NULL),
(4, 850000, '5 Star Hotel', 'Hotel Borobudur', '2020-05-07 10:39:51'),
(5, 450000, '4 Star Hotel', 'Louvre Hotel', '2020-05-07 11:02:12'),
(6, 1000000, '5 Star Hotel', 'Hotel Indonesia', '2020-05-09 09:54:53'),
(7, 1000000, '5 Star Hotel', 'Hotel GrandZuri', NULL),
(8, 800000, '5 Star Hotel', 'Hotel Indonesia', '2020-05-11 11:10:27');

-- --------------------------------------------------------

--
-- Struktur dari tabel `packets`
--

CREATE TABLE `packets` (
  `id` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `description` varchar(230) DEFAULT NULL,
  `name` varchar(230) DEFAULT NULL,
  `deleted_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `packets`
--

INSERT INTO `packets` (`id`, `price`, `description`, `name`, `deleted_at`) VALUES
(1, 1000000, 'International Tour Guide + Transportation + Food(3x) + Destination Places = Metropolitan + Nature', 'Tera', NULL),
(2, 750000, 'Indonesian Tour Guide + Transportation + Food(3x) + Destination Places = Metropolitan or Nature', 'Giga', NULL),
(3, 500000, 'Indonesian Tour Guide + Transportation + Food(3x) + Destination Places = Nature', 'Mega', NULL);

-- --------------------------------------------------------

--
-- Struktur dari tabel `passenger`
--

CREATE TABLE `passenger` (
  `id` int(11) NOT NULL,
  `bookings_id` int(11) NOT NULL,
  `first_name` varchar(10) NOT NULL,
  `last_name` varchar(10) NOT NULL,
  `email` varchar(100) NOT NULL,
  `phone` varchar(12) NOT NULL,
  `deleted_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `passenger`
--

INSERT INTO `passenger` (`id`, `bookings_id`, `first_name`, `last_name`, `email`, `phone`, `deleted_at`) VALUES
(26, 63, 'Hector', 'Moreno', 'hector@gmail.com', '087694037483', NULL),
(27, 63, 'Keith', 'Kayamba', 'keith@gmail.com', '0886940385', NULL),
(28, 64, 'Carlos', 'Kaiser', 'carlos@gmail.com', '081392839403', NULL),
(29, 64, 'Tanboy', 'Kun', 'tanboy@gmail.com', '081392834849', NULL),
(30, 65, 'Adi', 'Panigoro', 'adi@gmail.com', '08139874673', NULL),
(31, 65, 'Slamet', 'Pinto', 'slamet@gmail.com', '081375869402', NULL),
(32, 65, 'Luis', 'Reano', 'luis@gmail.com', '089687930182', NULL),
(33, 65, 'Louis', 'Milla', 'louis@gmail.com', '087496840384', NULL),
(34, 66, 'Hector', 'Bellerin', 'hectorbel@gmail.com', '081386789304', NULL),
(35, 67, 'Hector', 'Bellerin', 'hecbel@gmail.com', '089678379402', NULL),
(36, 68, 'Granit', 'Shaka', 'shakagranit@gmail.com', '081398947584', NULL),
(37, 68, 'Dirk', 'Kuy', 'dirkk@gmail.com', '081375859303', NULL),
(38, 70, 'Faiz', 'Anugerah', 'faiz@gmail.com', '08139738395', NULL),
(39, 71, 'Nafi', 'Althofa', 'nafi@gmail.com', '08139869749', NULL),
(40, 71, 'Naf', 'Althof', 'nafi@gmail.co', '0813986974', NULL),
(41, 71, 'Na', 'Altho', 'nafi@gmail.c', '081398697', NULL),
(42, 72, 'Deya', 'Eka', 'deya@gmail.com', '081398748493', NULL),
(43, 72, 'Yosua', 'Gunawan', 'yos@gmail.com', '08397291352', NULL),
(44, 72, 'Yosi', 'Setiawan', 'yosii@gmail.com', '0895753953', NULL),
(45, 73, 'Eka', 'Ramdani', 'eka@gmail.com', '081392729434', NULL),
(46, 73, 'Eko', 'Satrio', 'eko@gmail.com', '081394820583', NULL),
(47, 73, 'Yeremia', 'Nasution', 'yere@gmail.com', '081394385395', NULL),
(48, 74, 'Xavi', 'Hernandez', 'xavi@gmail.com', '08139327394', NULL),
(49, 74, 'Lionel', 'Messi', 'messi@gmail.com', '089683729402', NULL),
(50, 74, 'Sergio', 'Busquets', 'sergio@gmail.com', '081365783', NULL),
(51, 75, 'Javier', 'Mascerano', 'javier@gmail.com', '081392173914', NULL),
(52, 75, 'Dani', 'Alves', 'dani@gmail.com', '08319271211', NULL),
(53, 76, 'Adam', 'Alexander', 'adamalex@gmail.com', '081375928573', NULL),
(54, 76, 'Imam', 'Alexander', 'mamalex@gmail.com', '089682939173', NULL),
(55, 76, 'Ropi', 'Chandra', 'ropchan@gmail.com', '08967492573', NULL),
(56, 77, 'Nabilah', 'Ratna', 'nabilah@gmail.com', '08967291742', NULL),
(57, 77, 'Raihan', 'Al Fikri', 'raihanal@gmail.com', '081284538439', NULL),
(58, 77, 'Rifqi', 'Farhan', 'rif@gmail.com', '08129574953', NULL),
(59, 78, 'Pepe', 'Simon', 'simon@gmail.com', '0813942842', NULL),
(60, 78, 'Faiz', 'Panigoro', 'faizz@gmail.com', '08137494024', NULL),
(61, 79, 'Martinez', 'Setiawan', 'marti@gmail.com', '08963829301', NULL),
(62, 79, 'Imam', 'Althofi', 'mam@gmail.com', '081284924749', NULL),
(63, 80, 'Deya', 'Eka', 'deyanin@gmail.com', '08967483974', NULL),
(64, 80, 'Rofi', 'Chandra', 'rofichan@gmail.com', '08967482942', NULL);

-- --------------------------------------------------------

--
-- Struktur dari tabel `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `first_name` varchar(10) NOT NULL,
  `last_name` varchar(10) NOT NULL,
  `address` varchar(200) NOT NULL,
  `email` varchar(100) NOT NULL,
  `phone` varchar(12) NOT NULL,
  `username` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  `status` varchar(1) NOT NULL DEFAULT 'U',
  `deleted_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `users`
--

INSERT INTO `users` (`id`, `first_name`, `last_name`, `address`, `email`, `phone`, `username`, `password`, `status`, `deleted_at`) VALUES
(14, 'Christian', 'Frans', 'Malang', 'cfm@gmail.com', '081275849374', 'christianfm', 'inipasswordsaya', 'A', NULL),
(15, 'Deyaninta', 'Ekabriela', 'Sawangan', 'deya@gmail.com', '081392827493', 'deyaninta', 'inipasswordadmin', 'A', NULL),
(16, 'Rofi', 'Chandra', 'Salatiga', 'rofi@gmail.com', '089638920129', 'rofichandra', 'inidiapasswordsaya', 'A', NULL),
(17, 'Nafi', 'Althofa', 'Bojongsoang', 'nafi@gmail.com', '087893828162', 'nafialthofa', 'nafimainpointblank', 'U', NULL),
(18, 'Faiz', 'Anugerah', 'Babakan', 'faiz@gmail.com', '089684950486', 'faizanugerah', 'sukamaindoraemon', 'U', NULL),
(19, 'Mufadhal', 'Farraz', 'Tanjung Pinang', 'fadhal@gmail.com', '081376589304', 'mufadhalfarraz', 'kartonyonomedotjanji', 'U', NULL),
(20, 'Kevin', 'Sugiono', 'Batam', 'kepinsugi@gmail.com', '081398739203', 'kevinsugiono', 'sugionokevin', 'U', NULL),
(21, 'Amelia', 'Setiawan', 'Bintaro', 'amelia@gmail.com', '08967382937', 'ameliasetiawan', 'setiawanamelia', 'U', NULL);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `airlines`
--
ALTER TABLE `airlines`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `bookings`
--
ALTER TABLE `bookings`
  ADD PRIMARY KEY (`id`),
  ADD KEY `users_id` (`users_id`),
  ADD KEY `hotels_id` (`hotels_id`),
  ADD KEY `packets_id` (`packets_id`),
  ADD KEY `airlines_id` (`airlines_id`);

--
-- Indeks untuk tabel `hotels`
--
ALTER TABLE `hotels`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `packets`
--
ALTER TABLE `packets`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `passenger`
--
ALTER TABLE `passenger`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `phone` (`phone`),
  ADD KEY `bookings_id` (`bookings_id`);

--
-- Indeks untuk tabel `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `phone` (`phone`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `airlines`
--
ALTER TABLE `airlines`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT untuk tabel `bookings`
--
ALTER TABLE `bookings`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=81;

--
-- AUTO_INCREMENT untuk tabel `hotels`
--
ALTER TABLE `hotels`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT untuk tabel `packets`
--
ALTER TABLE `packets`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT untuk tabel `passenger`
--
ALTER TABLE `passenger`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=65;

--
-- AUTO_INCREMENT untuk tabel `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `bookings`
--
ALTER TABLE `bookings`
  ADD CONSTRAINT `bookings_ibfk_1` FOREIGN KEY (`users_id`) REFERENCES `users` (`id`),
  ADD CONSTRAINT `bookings_ibfk_2` FOREIGN KEY (`hotels_id`) REFERENCES `hotels` (`id`),
  ADD CONSTRAINT `bookings_ibfk_3` FOREIGN KEY (`packets_id`) REFERENCES `packets` (`id`),
  ADD CONSTRAINT `bookings_ibfk_4` FOREIGN KEY (`airlines_id`) REFERENCES `airlines` (`id`);

--
-- Ketidakleluasaan untuk tabel `passenger`
--
ALTER TABLE `passenger`
  ADD CONSTRAINT `passenger_ibfk_1` FOREIGN KEY (`bookings_id`) REFERENCES `bookings` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
