# YNDX_NumericalPuzzles
Числовые ребусы
 Алиса изучает английский язык. Ей надоела обычная речь, поэтому она решила говорить числовыми ребусами:

    Каждой строчной букве латинского алфавита Алиса сопоставила двоичный разряд, начиная с младшего: a — 0-й разряд, b — 1-й, …, z — 25-й.
    Чтобы произнести букву, Алиса инвертирует соответствующий букве бит в специальной переменной W и сообщает новое значение W в десятичной системе.

    Определение: инверсия бита j в числе x  — изменение значения j-го разряда числа x в двоичной системе на противоположное (0 становится 1, 1 становится 0).

    Пример: число 15 (1111) после инверсии бита 2 становится равным числу 11 (1011).

    Также Алиса произносит пробел, используя для этого 26-й разряд.

Значение переменной W перед произнесением Алисой первого символа равно 0.

Напишите программу, которая переведет сказанный Алисой числовой ребус.

Примечание: Алиса использует пробел наравне с буквами латинского алфавита  — для пробела не существует дополнительных ограничений и условий для его произнесения.

Формат ввода
В первой строке содержится единственное целое число n (1≤n≤500)  — количество чисел, сказанных Алисой.

Во второй строке расположено n целых чисел Wi (0≤Wi<2^27)  — значения переменной W после произнесения Алисой i-го символа.
Формат вывода
В единственной строке выведите n символов  — строчные буквы латинского алфавита или пробел в порядке произнесения их Алисой. 
