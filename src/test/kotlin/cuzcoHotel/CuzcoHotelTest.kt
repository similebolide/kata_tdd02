package cuzcoHotel

import cuzcoHotel.rooms.IRoomRepository
import cuzcoHotel.rooms.Room
import cuzcoHotel.rooms.RoomRepository
import cuzcoHotel.rooms.RoomStub
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class CuzcoHotelTest {

    @Test
    @DisplayName("it should return a list of rooms")
    fun itShouldReturnAListOfRooms() {
        //GIVEN
        val roomStub:IRoomRepository = RoomStub()
        val expected = roomStub.getList()

        //WHEN
        val actual = CuzcoHotel(roomStub).getRooms()

        //THEN
        assertEquals(expected, actual)
    }

}