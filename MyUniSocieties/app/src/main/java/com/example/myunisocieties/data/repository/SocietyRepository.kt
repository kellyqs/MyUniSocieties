
/**
 * Repository that provides insert, update, delete, and retrieve of [Society] from a given data source.
 */
interface SocietyRepository {
    /**
     * Retrieve all the items from the the given data source.
     */
    fun getAllSocietiesStream(): Flow<List<Society>>

    /**
     * Retrieve an item from the given data source that matches with the [id].
     */
    fun getSocietyStream(id: Int): Flow<Society?>

    /**
     * Insert item in the data source
     */
    suspend fun insertSociety(society: Society)

    /**
     * Delete item from the data source
     */
    suspend fun deleteSociety(society: Society)

    /**
     * Update item in the data source
     */
    suspend fun updateSociety(society: Society)
}