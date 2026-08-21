class Solution(object):
    def strStr(self, haystack, needle):
        if needle in haystack:
            pos=haystack.index(needle)
        else:
            pos=-1
        return pos
        