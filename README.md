 # Project Hospital :hospital:

## Description
It is a small project that controls the **payroll** and **rest** of hospital employees.

There are 3 roles of employees :

1️⃣ **Doctor**:

   -➡️ **Specialization**: **Surgeon**
  
2️⃣ **Nurse**

3️⃣ **Secretary**

Two(2) controllers are implemented: The one manages the **payroll**(SalaryController) and the other the **rest**(RestController) of the employees.

There are also two(2) interfaces in which the **basic salary** of all employees and the **basic rest days** are **predefined**.

For the final salary and rest, different parameters are taken into account for each kind of employee:

- Doctor:  Number of attended cases
- Surgeon: Number of operations performed
- Nurse : Number of  vaccinations given
- Secretary: Number of calls answered

Finally, all the above are taken into account in order to estimate the final salary and rest days of each employee.
