package com.flikendo.efidiu.constants

import java.util.*

/**
 * This class is used for reading application.properties file.
 * It should be able to be called from all classes
 */
class PropertyReader {
    // Private field
    private val properties = Properties()

    /**
     * Returns property given as parameter
     */
    fun getProperty(key: String): String = properties.getProperty(key)
}