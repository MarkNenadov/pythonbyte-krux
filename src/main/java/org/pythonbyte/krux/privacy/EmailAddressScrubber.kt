package org.pythonbyte.krux.privacy

class EmailAddressScrubber : PIIScrubber {
    override fun scrub(str: String): String {
        val emailRegex =
            Regex(
                """(?x)
                [a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}
                """,
            )

        return emailRegex.replace(str) { "[EMAIL REDACTED]" }
    }
}
