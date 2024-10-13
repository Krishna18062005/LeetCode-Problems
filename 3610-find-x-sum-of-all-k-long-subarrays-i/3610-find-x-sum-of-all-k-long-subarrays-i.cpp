class Solution {
public:
    vector<int> findXSum(vector<int>& nums, int k, int x) {
        int n = nums.size();
        vector<int> ans(n - k + 1);

        unordered_map<int, int> mp; // Frequency map
        int left = 0, right = 0;

        // Sliding window
        while (right < n) {
            // Increment the frequency of the current element
            mp[nums[right]]++;

            // When the window reaches size k
            if (right - left + 1 == k) {
                // Create a vector to store (element, frequency) pairs
                vector<pair<int, int>> elements(mp.begin(), mp.end());

                // Sort elements by frequency (descending), and by value if frequencies are equal
                sort(elements.begin(), elements.end(), [](const pair<int, int>& a, const pair<int, int>& b) {
                    return a.second > b.second || (a.second == b.second && a.first > b.first);
                });

                // Calculate the X-Sum using the top x elements
                int sum = 0;
                for (int i = 0; i < min(x, (int)elements.size()); ++i) {
                    sum += elements[i].first * elements[i].second;
                }

                // Store the result for this subarray
                ans[left] = sum;

                // Move the window: decrease the frequency of the leftmost element
                mp[nums[left]]--;
                if (mp[nums[left]] == 0) {
                    mp.erase(nums[left]);
                }

                // Slide the window
                left++;
            }

            // Expand the window
            right++;
        }

        return ans;
    }
};