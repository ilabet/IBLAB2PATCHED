package com.example.iblab2seniorclass
class EmailFetcher {
    companion object {
        private val senders = listOf("Dahlia Cline", "Kevin Miranda", "Kaya Austin", "Laila Calderon",
            "Marquise Rhodes", "Fletcher Patel", "Luz Barron", "Kamren Dudley", "Jairo Foster", "Lilah Sandoval",
            "Ansley Blake", "Slade Sawyer", "Jaelyn Holmes", "Phoenix Bright", "Ernesto Gould")

        private const val TITLE = "Welcome to Kotlin!"
        private const val SUMMARY = "Welcome to the Android Kotlin Course! We're excited to have you..."

        fun getEmails(): MutableList<Email> {
            val emails = mutableListOf<Email>()
            for (i in 0..9) {
                emails.add(Email(senders[i], TITLE, SUMMARY))
            }
            return emails
        }

    }
}
