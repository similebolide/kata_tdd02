package cuzcoHotel

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import cuzcoHotel.*


class CuzcoHotelTest {
    @Test
    @DisplayName("it should return a list of room numbers")
    fun itShouldReturnAListOfRoomNumbers() {
        //GIVEN
        val expected = listOf()

        //WHEN
        val actual = CuzcoHotel().getRooms()

        //THEN
        assertEquals(expected, actual)
    }

    @Test
    @DisplayName("it should return a list of rooms")
    fun itShouldReturnAListOfRooms() {
        //GIVEN

        val expected = listOf(
            Room(

            )
        )
        //WHEN
        val actual = CuzcoHotel().getRooms()

        //THEN
        assertEquals(expected, actual)
    }

    class RoomRepositoryStub (

    )
}