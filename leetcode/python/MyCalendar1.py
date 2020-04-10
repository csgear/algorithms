
# leecode.com 729. My Calendar I

class MyCalendar(object):

    def __init__(self):
        self.intervals = []

    def book(self, start, end):
        """
        :type start: int
        :type end: int
        :rtype: bool
        """
        for s, e in self.intervals:
        	if not (start >= e or end <= s): return False
        self.intervals.append((start, end))
        return True