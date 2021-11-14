package cz.skywall.multimoduleexample.core.mapper

import org.junit.Test
import cz.skywall.multimoduleexample.database.UserDB.UserDBFixters

class UserMapperKtTest {
    @Test
    fun `Some test`() {
        val user = UserDBFixters.defaultUser
    }
}