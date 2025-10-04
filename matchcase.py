match percent_grade:
    case _ if 90 <= percent_grade <= 100:
        letter_grade = "A"
    case _ if 80 <= percent_grade < 90:
        letter_grade = "B"
    case _ if 75 <= percent_grade < 80:
        letter_grade = "C"
    case _ if 65 <= percent_grade < 75:
        letter_grade = "D"
    case _ if 60 <= percent_grade < 65:
        letter_grade = "E"
    case _:
        letter_grade = "F"
