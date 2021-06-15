package cuzcoHotel

import cuzcoHotel.rooms.IRoomRepository
import cuzcoHotel.rooms.Room
import cuzcoHotel.rooms.RoomRepository
import cuzcoHotel.rooms.RoomStub

class CuzcoHotel(val roomRepo:IRoomRepository){

    fun getRooms() : List<Room> {
        return roomRepo.getList()
    }


}


