# 문자열 존재 여부 판별
def check_word(s, keyword) :
    if (s.find(keyword) == -1) :         # find로 찾으면 찾는 인덱스를, 찾지 못하면 -1 출력
        print('%s은(는) 존재하지 않는다!' % keyword)
    else : 
        print('%s은(는) 존재한다!' % keyword)

string = "A good book is a great friend."
word = "friend"

print('문장 : ', string)
print('찾는단어 : ', word)

check_word(string, word)

# p308
# 다수의 문자열 치환하기
def replace_word(string, word_list, word) :
    arr = string.split(" ")
    new_arr = []
    for x in arr :
        if x in word_list :
            new_arr.append(word)
        else : 
            new_arr.append(x)

    result = " ".join(new_arr)
    return result

string = "python java php apple orange banana"
word_list = ["apple", "orange", "banana"]
word = "fruits"
print('문자열 : ', string)
print('단어 리스트 : ', word_list)
print('치환할 단어 : ', word)

new_str = replace_word(string, word_list, word)
print('치환된 문자열 : ', new_str)

