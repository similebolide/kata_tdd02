package cuzcoHotel

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test


internal class CuzcoHotelTest {
    @Test
    @DisplayName("it should return a list of room numbers")
    fun itShouldReturnAListOfRoomNumbers() {
        //GIVEN
        val expected = listOf(102)

        //WHEN
        val actual = CuzcoHotel().getRooms()

        //THEN
        assertEquals(expected, actual)
    }
}