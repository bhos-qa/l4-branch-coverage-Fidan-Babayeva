Statement Coverage <br>
Statement coverage is a code coverage metric that tracks the execution of individual statements in the code.

Learning Outputs:

Comprehensive Testing: Statement coverage ensures that every line of code is executed at least once during testing. This metric helps identify untested code segments.

Basic Metric: It's a fundamental and easy-to-understand metric, making it suitable for initial code coverage analysis.

Limitations: While statement coverage can identify unexecuted code lines, it doesn't guarantee that all code paths are tested. Branches within conditional statements might still remain untested.

Branch Coverage <br>
Branch coverage measures whether every possible branch within conditional statements is executed.

Learning Outputs:

Granularity: Branch coverage provides a more detailed analysis compared to statement coverage. It ensures that each branch (true and false) within conditionals is tested.

Complexity Awareness: It's effective at revealing issues related to complex decision-making code, such as missing or incorrect conditions.

Challenges: Achieving full branch coverage can be challenging, especially in complex code with nested conditionals. It might lead to an extensive number of test cases.

Predicate Coverage <br>
Predicate coverage is a higher-level coverage metric that focuses on decision outcomes within conditionals.

Learning Outputs:

Advanced Metric: Predicate coverage goes beyond simple statement and branch coverage. It specifically targets decision outcomes, making it a more advanced metric.

Accurate Insights: It provides accurate insights into whether all possible decision outcomes (combinations of conditions) are tested.

Test Case Reduction: In some cases, achieving predicate coverage can lead to a reduction in the number of test cases needed, as it prioritizes critical decision points.
