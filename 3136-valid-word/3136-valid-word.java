class Solution {
    public boolean isValid(String word) {
        return word.matches("(?i)(?=.*[b-df-hj-np-tv-z])(?=.*[aeiou])^[a-z0-9]{3,}$");
    }
}

// (?i)                     -> Case insensitive flag
// (?=.*[b-df-hj-np-tv-z])  -> atleast one constant
// (?=.*[aeiou])            -> atleast one vowel
// ^[a-z0-9]{3,}$           -> Only Alphanumeric, Minimum 3 characters