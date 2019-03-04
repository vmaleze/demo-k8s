# Getting Started

* Start [minikube](https://kubernetes.io/docs/tasks/tools/install-minikube/)
  * Start the dashboard => `minikube dashboard`

* Create a first µs using [spring](http://start.spring.io)
  * Add a route
  * Setup Docker config
  * Build and tag image then push it to your docker repo
  * Deploy it via the dashboard
  * Get the Deployment.yml for further usage
  * Setup the service `kubectl expose my-service --type=LoadBalancer --port=8080 --targetPort=80`
  * Verify that everything works

* Create a second µs following the previous setup
  * Make it call the first one using a config variable
  * Create the config map `kubectl create configmap client-config --from-file=<myapplicationprop.yml>`
  * [Edit your Deployment.yml to use the configmap](https://kubernetes.io/docs/tasks/configure-pod-container/configure-pod-configmap/#add-configmap-data-to-a-specific-path-in-the-volume)
  * In your config map, use the service-name of the first application as the url to call
  * It should work