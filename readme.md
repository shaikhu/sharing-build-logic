Let's say all of our projects will be java projects.

In this case we want to apply a common set of rules to all them, such as a source directory layout, compiler flags, code style conventions, code quality checks and so on.

Two out of the three projects are more than just Java projects - they are libraries that we perhaps want to publish to an external repository.  Publishing configuration, such as a common group name for the libraries as well as the repository coordinates might be a cross-cutting concern that both libraries need to share. For this example let's also say that we want to therefore enforce that our libraries expose some coordinates.


