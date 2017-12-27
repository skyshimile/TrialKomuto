# TrialKomuto
Configuration

    Enable Git Integration. In order to access all Git features, you need to enable Git Integration first. The option is available at following settings: Window > Katalon Studio Preferences > Katalon > Git. Once enabled, you can start using Git at Katalon Studio main toolbar.


    Advanced configurations are available at Window > Preferences > Team > Git in case you want more specific setups.


Clone Project

After enabling Git Integration, you can clone an existing Git repository into a newly created directory on the local machine.

    Select Clone Project from Git menu of the main toolbar.


    The Source Git Repository dialog will be displayed. 

    Where:

Repository URL	The URL to your Git repository (Should be in HTTPS protocol).
Username	The username to access the Git repository.
Password	The password to access the Git repository.

Enter all required information and click the Next button to let Katalon Studio gets details about your repository.

If you cannot access the repository after clicking Next button, the connection may have issues with SSL verification. Refer to this article for workaround suggestions.

At Branch Selection screen, you can choose which branches to be checked out as local branches. Click the Next button to continue.

At Local Destination dialog, specify the local location for cloning as well as the initial branch.

Where:

    Directory	The local storage location you want to store your Git's repository.
    Initial branch	All selected branches from the previous step will be displayed here. Select the branch to be used initially from this list.

    Click Finish when you are done. Katalon Studio will automatically open your cloned project. 

 
Share Project

Share Project is a step to make your Katalon project associated with Git.

    Select Share Project from Git menu of the main toolbar.


    Folder .git and file .gitignore will be created within the Katalon project.


    .gitignore tells Git which files (or patterns) it should ignore. By default, .gitignore content will contain these files and patterns:

    /bin
    /Libs
    .settings
    .classpath
    /.svn

Commit

The Commit option allows users to view all current changes and decide which changes to be stored in local branch. Refer to https://git-scm.com/docs/git-commit for detailed Git documentation regarding Commit command.

    Select the Commit option from Git menu of the main toolbar. 


    The Git Staging tab will be display for configuration.

    Where:

    Unstaged Changes	Changes which have been made.
    Staged Changes	Selected changes from Unstaged Changes. These changes will be committed.
    From the Unstaged Changes list, select the changes to be committed, then right-click on them and select Add To Index. Selected changes will be added to the Staged Changes list.

    Enter your comments into the Commit Message then click on Commit to store your staged changes into the local branch.

 
Manage Branches
New Branch

    Select the New Branch option from Git menu of the main toolbar. 


    The Create Branch dialog will be displayed. 

    Where:

    Source	

    Select either remote or local branch which will be your source branch.

    Branch name	The name to be used for the new branch.
    Checkout new branch	Option to let Katalon Studio checkout that branch after created.
    Click Finish to create new branch.

 
Checkout Branch

The Checkout Branch option allow you to switch from one branch to another.

    Select the Checkout Branch option from Git menu of the main toolbar. 


    The Select Source dialog will be displayed. Select the local branch you want to check out to be current branch. The branch with √ icon is your current local branch.


    Click OK to finish checking out to new local branch.

 
Delete Branch

    Select the Delete Branch option from Git menu of the main toolbar. 


    On this dialog, both local and remote branches are displayed. Select a branch to be deleted then click OK.

 
Fetch

Retrieve all information about changes occurred in remote branches. Refer to https://git-scm.com/docs/git-fetch for detailed Git documentation regarding Fetch command

    Select the Fetch option from Git menu of the main toolbar. 


    It will automatically fetch remote branches, tags, and remote changes.


    Select History from main toolbar 


    Details regarding all the branches and tags you've just fetched will be displayed.

 
Pull

Incorporate changes from a remote repository into the current branch. Refer to https://git-scm.com/docs/git-pull for detailed Git documentation regarding Pull command

    Select the Pull option from Git menu of the main toolbar. 


    In the Pull dialog, select the remote branch to be pulled into your local branch. Click Finish. 


    The Pull Result dialog will be displayed with all data about pulling request taken on the selected branch.

 
Push

Update remote branch using the local branch. Refer to https://git-scm.com/docs/git-push for detailed Git documentation regarding Push command

Before doing any push, you have to commit your changes first. 

    Select Push option from Git menu of the main toolbar. 
    The Push to Branch dialog will be displayed. Choose from the Remote branch list which branch to be updated (All remote branches in your Git repository are listed here). 


    Click Next after finished selecting your remote branch.

    If you enter a different name besides the listed branches, a new remote branch with that name will be created accordingly.
    The Push Confirmation Dialog will be displayed with details regarding your commit.

    Click on Finish to push your commits to the remote repository.
