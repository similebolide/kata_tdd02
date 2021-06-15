package cuzcoHotel.rooms

class RoomStub:IRoomRepository{
    fun getList(): List<Room>{
        return listOf(
            Room(
                id = 101,
                floor = 1,
                description = "1 king size bed - A/C - Wi-Fi - private bathroom - wheelchair accessible",
                capacity = 2
            ),
            Room(
                id = 102,
                floor = 1,
                description = "2 queen size beds - A/C - Wi-Fi - private bathroom - wheelchair accessible",
                capacity = 4
            )
        )
    }
}