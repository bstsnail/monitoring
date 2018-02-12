package com.bstsnail.monitoring

import org.influxdb.InfluxDBFactory
import org.influxdb.dto.Query
import org.junit.Test

/**
 * deng
 * 12/02/2018
 */
class TestInflux {

    @Test
    fun test() {
        val dbName = "mydb"
        val query = Query("select * from temperature", dbName)
        val influxDB = InfluxDBFactory.connect("http://localhost:8086")
        val queryResult = influxDB.query(query)
        println(queryResult.results)
    }
}