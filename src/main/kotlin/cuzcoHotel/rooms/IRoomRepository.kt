package cuzcoHotel.rooms

interface IRoomRepository {
    fun getList(): List<Room>
}