Egy alkalmazást írunk, ahol a megrendelő szeretné az alkalmazásban tárolt ügyfeleit és azok telefonszámát exportálni fájlba.

Hozd létre a Phonebook osztályt, és abban az exportPhonebook(Map<String, String> contacts, String output) metódust.

A paraméterben kapott Mapben a kulcsok nevek, az értékek pedig telefonszámok. Írd ki az összes kulcs-érték párt az outputként megadott címre, minden kulcs-érték párt egy új sorba, az alábbi szintaxisban:

név: telefonszám

A kiírás sorrendje a fájlba nem fontos, de a Map összes elemét pontosan egyszer írd ki a fájlba!

Ha a metódus akármelyik paraméternek null-t kapna, akkor dobj IllegalArgumentException-t!