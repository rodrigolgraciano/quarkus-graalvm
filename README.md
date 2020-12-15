use Cloud Build to build your image, it will upload to a Google Cloud Storage bucket all the files of your application (except the ones ignored by the `.gcloudignore`file), build your Docker image and push it to Google Container Registry (GCR).

  gcloud builds submit --tag gcr.io/PROJECT-ID/helloworld
You can also build your image locally and push it to a publicly accessible Docker registry, then use this image in the next step.
Finally, use Cloud Run to launch your application.

  gcloud run deploy --image gcr.io/PROJECT-ID/helloworld --platform managed
  
  https://quarkus.io/guides/deploying-to-google-cloud
