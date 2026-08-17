package BinarySearch;

public class Smallest_Letter_Greater_Than_Target_Leetcode_744 {
}


/*
This question is connected to the Floor logic.

GFG Floor mein ye ho rha tha:
arr[mid] <= x
    ↓
valid candidate
    ↓
right jao

744 mein question उल्टा है: target se strictly greater smallest character find karo.

Isliye:
letters[mid] <= target
        ↓
ye answer nahi hai
        ↓
right jao
        ↓
lo = mid + 1

Aur:
letters[mid] > target
        ↓
possible answer
        ↓
left jao
        ↓
hi = mid - 1

Example:
letters = ['c', 'f', 'j']
target = 'c'

Binary search ke baad:
lo = 1
letters[1] = 'f'

Answer:
'f'

lo % letters.length kyu?
Problem mein wrap-around hai.

Example:
letters = ['c', 'f', 'j']
target = 'j'

j se greater koi character nahi hai, to answer first character 'c' hoga.

Search ke baad:
lo = 3

लेकिन letters[3] invalid hai.

So:
letters[lo % letters.length]

gives:
letters[3 % 3]
letters[0]
'c'

Important: Is problem mein ans ki zarurat nahi hai. lo directly smallest element greater than target ka insertion position deta hai.
* */