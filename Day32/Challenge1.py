# Challenge - Remove Consecutively Repeated Characters

"""
The program must accept a string S as the input. The program must remove the consecutively
repeated characters in the string S. Then the program must print the modified string S as the output.
Note: At least one consecutively non-repeated character is always present in the string S.
Boundary Condition(s):
3 <= Length of S <= 1000
Input Format:
The first line contains S.
Output Format:
The first line contains the modified string S.
Example Input/Output 1:
Input:
bookkeeping
Output:
bping
Explanation:
The consecutively repeated characters in the string bookkeeping are o, k and e.
After removing the characters o, k and e from the string, the string becomes bping.
Hence the output is bping 
Example Input/Output 2:
Input:
#5#C5C#5
Output:
#5#C5C#5
"""

# Solution

s= input().strip()
n = len(s)
i=0
while i<n:
    j=i+1
    while j<n and s[j]==s[i]:
        j+=1
    if j-i==1:
        print(end=s[i])
    i=j
