-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-06-2021 a las 01:48:54
-- Versión del servidor: 10.4.18-MariaDB
-- Versión de PHP: 8.0.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hotelbd`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `Nombre` varchar(45) NOT NULL,
  `TipoHab` varchar(45) NOT NULL,
  `CdOrigen` varchar(45) NOT NULL,
  `NPersonas` int(5) NOT NULL,
  `Dias` int(5) NOT NULL,
  `Ingreso` varchar(15) NOT NULL,
  `Salida` varchar(15) NOT NULL,
  `Hospedaje` int(5) NOT NULL,
  `NHabitacion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`Nombre`, `TipoHab`, `CdOrigen`, `NPersonas`, `Dias`, `Ingreso`, `Salida`, `Hospedaje`, `NHabitacion`) VALUES
('Ahri Karyme', 'Triple', 'San Luis Potosi', 4, 2, '2021-06-23', '2021-06-25', 2000, 379),
('Cesar Ruiz', 'Sencilla', 'Aguascalientes', 1, 5, '2021-06-20', '2021-06-25', 500, 350),
('Eduardo Urzua', 'Sencilla', 'Baja California', 2, 3, '2021-06-24', '2021-06-27', 1050, 354),
('Emilo Galindo', 'Doble', 'Aguascalientes', 3, 3, '2021-06-29', '2021-07-02', 1500, 355),
('Emperador Nasus', 'Triple', 'Quintana Roo', 3, 7, '2021-06-23', '2021-06-30', 1450, 360),
('Juan Valadez', 'Doble', 'CDMX', 2, 2, '2021-06-23', '2021-06-25', 950, 378),
('Kindred Daniel', 'Doble', 'Queretaro', 2, 1, '2021-06-23', '2021-06-24', 950, 359),
('Marcos David', 'Sencilla', 'Sonora', 1, 6, '2021-06-26', '2021-07-02', 500, 353),
('Oriana Jaquelin', 'Triple', 'Baja California', 4, 4, '2021-06-26', '2021-06-30', 2000, 380),
('Teemo Paulino', 'Sencilla', 'Quintana Roo', 0, 4, '2021-06-18', '2021-06-22', 500, 370);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuentas`
--

CREATE TABLE `cuentas` (
  `cuenta` varchar(20) NOT NULL,
  `password` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cuentas`
--

INSERT INTO `cuentas` (`cuenta`, `password`) VALUES
('Cesar', 'f3d5123e17ebed15d4578d33713a3078'),
('Eduardo', '3b3505c47a26cf1b80061d9d87c89674'),
('Emilio', 'c3218490c7de3f422beb39a80627a532'),
('Marcos', '14ddaa7c28910f8357630bee75430087');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitaciones`
--

CREATE TABLE `habitaciones` (
  `Numerodehabitacion` int(5) NOT NULL,
  `Piso` int(2) NOT NULL,
  `Tipo` int(2) NOT NULL,
  `Disponibilidad` int(2) NOT NULL,
  `Precio` int(5) NOT NULL,
  `PersonaExtra` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `habitaciones`
--

INSERT INTO `habitaciones` (`Numerodehabitacion`, `Piso`, `Tipo`, `Disponibilidad`, `Precio`, `PersonaExtra`) VALUES
(350, 1, 1, 0, 500, 0),
(351, 1, 1, 1, 500, 0),
(352, 1, 1, 1, 500, 0),
(353, 1, 1, 0, 500, 0),
(354, 1, 1, 0, 500, 0),
(355, 1, 2, 0, 950, 0),
(356, 1, 2, 1, 950, 0),
(357, 1, 2, 1, 950, 0),
(358, 1, 2, 1, 950, 0),
(359, 1, 2, 0, 950, 0),
(360, 1, 3, 0, 1450, 0),
(361, 1, 3, 1, 1450, 0),
(362, 1, 3, 1, 1450, 0),
(363, 1, 3, 1, 1450, 0),
(364, 1, 3, 1, 1450, 0),
(370, 2, 1, 0, 500, 0),
(371, 2, 1, 1, 500, 0),
(372, 2, 1, 1, 500, 0),
(373, 2, 1, 1, 500, 0),
(374, 2, 2, 1, 950, 0),
(375, 2, 2, 1, 950, 0),
(376, 2, 2, 1, 950, 0),
(377, 2, 2, 1, 950, 0),
(378, 2, 2, 0, 950, 0),
(379, 2, 3, 0, 1450, 0),
(380, 2, 3, 0, 1450, 0),
(381, 2, 3, 1, 1450, 0),
(382, 2, 3, 1, 1450, 0),
(383, 2, 3, 1, 1450, 0),
(384, 2, 3, 1, 1450, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ingresoshotel`
--

CREATE TABLE `ingresoshotel` (
  `Llave` int(1) NOT NULL,
  `ingresos` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `ingresoshotel`
--

INSERT INTO `ingresoshotel` (`Llave`, `ingresos`) VALUES
(1, 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`Nombre`);

--
-- Indices de la tabla `cuentas`
--
ALTER TABLE `cuentas`
  ADD PRIMARY KEY (`cuenta`);

--
-- Indices de la tabla `habitaciones`
--
ALTER TABLE `habitaciones`
  ADD PRIMARY KEY (`Numerodehabitacion`);

--
-- Indices de la tabla `ingresoshotel`
--
ALTER TABLE `ingresoshotel`
  ADD PRIMARY KEY (`Llave`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
