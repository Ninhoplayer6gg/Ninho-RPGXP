package com.arkanis.engine.core

class Engine {

    private val gameObjects = mutableListOf<GameObject>()
    private var isRunning = false

    fun addObject(obj: GameObject) {
        gameObjects.add(obj)
        obj.start()
    }

    fun start() {
        isRunning = true
        gameLoop()
    }

    private fun gameLoop() {
        val deltaTime = 0.016f // Simulação ~60 FPS

        while (isRunning) {
            update(deltaTime)
        }
    }

    private fun update(deltaTime: Float) {
        for (obj in gameObjects) {
            if (obj.isActive) {
                obj.update(deltaTime)
            }
        }
    }

    fun stop() {
        isRunning = false
    }
}
