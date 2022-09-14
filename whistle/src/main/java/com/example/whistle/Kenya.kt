package com.example.whistle
class Kenya {
    companion object {
        private val counties: HashMap<String, String> = hashMapOf(
            "Mombasa" to "001",
            "Kwale" to "002",
            "Kilifi" to "003",
            "Tana River" to "004",
            "Lamu" to "005",
            "Taita Taveta" to "006"
        )

        fun getCounties(): HashMap<String, String> {
            return counties
        }

        fun getCountyName(code: String): String {
            var county: String? = null
            counties.forEach {
                if (it.value == code) {
                    county = it.key
                }
            }
            return county ?: "not found"
        }

        fun getCountyCode(name: String): String {
            var code: String? = null
            counties.forEach {
                if ((it.key).lowercase() == name.lowercase()) {
                    code = it.value
                }
            }
            return code ?: "not found"
        }
    }
} 