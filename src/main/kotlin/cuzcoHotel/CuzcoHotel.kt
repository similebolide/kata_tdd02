package cuzcoHotel

import cuzcoHotel.rooms.Room

class CuzcoHotel{

    fun getRooms() : List<Room> {
        return RoomRepository.getRoomList()
    }


}


