const express = require("express");

const router = express.Router();

const productoController = require("../controllers/productoController");

/**
 * @swagger
 * /productos:
 *   get:
 *     summary: Obtener todos los productos
 */
router.get("/", productoController.obtenerProductos);

/**
 * @swagger
 * /productos/{id}:
 *   get:
 *     summary: Obtener producto por ID
 */
router.get("/:id", productoController.obtenerProductoPorId);

/**
 * @swagger
 * /productos:
 *   post:
 *     summary: Crear producto
 */
router.post("/", productoController.crearProducto);

/**
 * @swagger
 * /productos/{id}:
 *   delete:
 *     summary: Eliminar producto
 */
router.delete("/:id", productoController.eliminarProducto);

module.exports = router;