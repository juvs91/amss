-- phpMyAdmin SQL Dump
-- version 3.3.9.2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 28-11-2012 a las 01:46:27
-- Versión del servidor: 5.5.9
-- Versión de PHP: 5.2.17

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

--
-- Base de datos: `Carrito`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compralibro`
--

CREATE TABLE `compralibro` (
  `compraId` int(11) DEFAULT NULL,
  `libroId` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `compralibro`
--

INSERT INTO `compralibro` VALUES(1, 1, 2);
INSERT INTO `compralibro` VALUES(1, 3, 4);
INSERT INTO `compralibro` VALUES(2, 2, 4);
INSERT INTO `compralibro` VALUES(3, 1, 3);
INSERT INTO `compralibro` VALUES(4, 4, 1);
INSERT INTO `compralibro` VALUES(6, 2, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compras`
--

CREATE TABLE `compras` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` datetime NOT NULL,
  `metodo_envio` int(11) NOT NULL,
  `costo_total` float NOT NULL,
  `peso_total` float NOT NULL,
  `envio_total` float NOT NULL,
  `usuarioId` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Volcar la base de datos para la tabla `compras`
--

INSERT INTO `compras` VALUES(1, '2012-11-14 00:44:44', 1, 200, 2, 220, 2);
INSERT INTO `compras` VALUES(2, '2012-11-20 00:45:53', 0, 180, 1.6, 200, 1);
INSERT INTO `compras` VALUES(3, '2012-11-16 00:46:43', 0, 140, 2.1, 180, 1);
INSERT INTO `compras` VALUES(4, '2012-11-23 00:47:32', 1, 250, 1.8, 270, 3);
INSERT INTO `compras` VALUES(5, '2012-11-23 00:51:03', 1, 300, 3, 330, 5);
INSERT INTO `compras` VALUES(6, '2012-11-16 01:36:20', 1, 200, 2.1, 221, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libros`
--

CREATE TABLE `libros` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `titulo` varchar(255) NOT NULL,
  `autor` varchar(255) NOT NULL,
  `precio` float NOT NULL,
  `peso` float NOT NULL,
  `cantDisponible` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Volcar la base de datos para la tabla `libros`
--

INSERT INTO `libros` VALUES(1, 'The hunger Games', 'Suzanne Collins', 350, 1.2, 100);
INSERT INTO `libros` VALUES(2, 'Babel 17', 'Samuel R. Delany', 200, 1, 55);
INSERT INTO `libros` VALUES(3, 'Fahrenheit 451', 'Ray Bradbury', 110, 0.4, 10);
INSERT INTO `libros` VALUES(4, 'Fantasmas y pastillas', 'Juan Vasen', 200, 1.1, 40);
INSERT INTO `libros` VALUES(5, 'Fiebre', 'Robin Cook', 80, 0.4, 38);
INSERT INTO `libros` VALUES(6, 'Héroes', 'Ray Loriga', 220, 0.8, 130);
INSERT INTO `libros` VALUES(7, 'Heidi', 'Juana Spyri', 180, 0.6, 20);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombreUsuario` varchar(25) NOT NULL,
  `contrasena` varchar(25) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Volcar la base de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` VALUES(1, 'ricardo', '1234');
INSERT INTO `usuarios` VALUES(2, 'A00809536', 'pass1234');